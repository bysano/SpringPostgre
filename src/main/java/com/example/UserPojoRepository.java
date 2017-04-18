package com.example;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alka0317
 * Date: 4/18/17
 * Time: 2:16 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserPojoRepository extends CrudRepository<UserPojo,Long> {
}
