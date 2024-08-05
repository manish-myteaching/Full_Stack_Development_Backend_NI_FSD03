package com.barclays.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.barclays.constant.QueryConstant;
import com.barclays.dao.RegistrationDAOImpl;
import com.barclays.dto.UserInfoDTO;
import com.barclays.util.DBUtil;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@Mock
	private Connection mockConnection;

	@Mock
	private PreparedStatement mockPreparedStatement;

	@Mock
	private DBUtil dbUtil;

	@InjectMocks
	private RegistrationDAOImpl userService;

	private UserInfoDTO userInfoDTO;

	@BeforeEach
	public void setUp() throws Exception {
		userInfoDTO = new UserInfoDTO("Sachin", "Tendulkar", "+43-782343345", "Mumbai", "Sachin01", "5676", "M");
		when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
	}

	@Test
    public void testRegisterUserInfo() throws Exception {
		// Mock successful execution of statements
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        try (MockedStatic<DBUtil> mockedDbUtil = Mockito.mockStatic(DBUtil.class)) {
            mockedDbUtil.when(DBUtil::getConnection).thenReturn(mockConnection);
            UserInfoDTO result = userService.registerUserInfo(userInfoDTO);
            verify(mockConnection).prepareStatement(QueryConstant.INSERT_USER_INFO.toString());
            verify(mockConnection).prepareStatement(QueryConstant.INSERT_USER_LOGIN_INFO.toString());
            verify(mockPreparedStatement, times(2)).executeUpdate();

            assertNotNull(result);
            assertEquals("Sachin", result.getFirstName());
            assertEquals("Tendulkar", result.getLastName());
        }
    }

	@Test
    public void testRegisterUserInfoSQLException() throws Exception {
        // Mock SQLException
        when(mockPreparedStatement.executeUpdate()).thenThrow(new SQLException());
        try (MockedStatic<DBUtil> mockedDbUtil = Mockito.mockStatic(DBUtil.class)) {
            mockedDbUtil.when(DBUtil::getConnection).thenReturn(mockConnection);
            UserInfoDTO result = userService.registerUserInfo(userInfoDTO);
            verify(mockConnection).prepareStatement(QueryConstant.INSERT_USER_INFO.toString());
            verify(mockConnection).prepareStatement(QueryConstant.INSERT_USER_LOGIN_INFO.toString());
            verify(mockConnection).rollback();
            assertEquals(result,null);
        }
    }

}
