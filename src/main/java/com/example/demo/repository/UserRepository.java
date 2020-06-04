package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wyw
 * @version 1.0
 * @date 2020/4/25 15:22
 */
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    List<User> findAll();

    @Override
    Page<User> findAll(Pageable pageable);

    List<User> findAllByPasswordContains(String name);

    List<User> findAllByPasswordEndsWith(String name);

    @Query(value = "SELECT  * FROM User ", nativeQuery = true)
    List<User> queryAllUsers();

    @Transactional
    @Modifying
    @Query(value = "UPDATE USER SET NAME = ?1 WHERE id= ?2 ; ", nativeQuery = true)
    void updateUserById(String name, long id);

    @Query(value = "SELECT  * FROM User  where name =?1 limit 1;", nativeQuery = true)
    User queryUserByName(String name);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM USER  WHERE NAME =?1", nativeQuery = true)
    void deleteUserByName(String name);

    List<User> findAllByPasswordIn(List<String> list);
}
