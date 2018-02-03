package com.ramazan.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.ramazan.api.domain.Constants.USER_LIMIT;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApiServiceImplTest
{
    @Autowired
    private ApiService apiService;

    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void getUsers()
    {
        Assert.assertEquals(USER_LIMIT.intValue(), apiService.getUsers(USER_LIMIT).size());
    }
}