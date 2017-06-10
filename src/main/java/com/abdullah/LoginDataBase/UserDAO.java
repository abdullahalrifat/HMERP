package com.abdullah.LoginDataBase;

import com.abdullah.Login.LoginBean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 2/6/17.
 */
@Component
public interface UserDAO
{
    public void insert(LoginBean loginBean);
    public List<LoginBean> UserVarifier();
}
