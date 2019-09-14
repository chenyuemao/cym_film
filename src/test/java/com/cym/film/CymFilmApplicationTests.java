package com.cym.film;

import com.cym.film.dao.entity.NextUser;
import com.cym.film.dao.mapper.NextUserMapper;
import com.cym.film.example.dao.UserMapper;
import com.cym.film.example.dao.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CymFilmApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private NextUserMapper nextUserMapper;

	@Test
	public void contextLoads() {

	}

	@Test
	public void mybatisHelloworld() {
		List<User> users = userMapper.selectList(null);
		users.forEach(System.out::println);

	}


	@Test
	public void mybatisGeneratorTest() {
		List<NextUser> nextUsers = nextUserMapper.selectList(null);
		nextUsers.forEach(System.out::println);
	}

	@Test
	public void addUser() {
		NextUser nextUser = new NextUser();
		nextUser.setUserName("study");
		nextUser.setUserPwd("123456");
		int isSuccess = nextUserMapper.insert(nextUser);
		System.out.println(isSuccess);
	}

}
