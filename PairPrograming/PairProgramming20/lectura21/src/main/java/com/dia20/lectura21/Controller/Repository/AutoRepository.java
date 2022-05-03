package com.dia20.lectura21.Controller.Repository;

import com.dia20.lectura21.Model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  AutoRepository  extends JpaRepository<Auto, Integer> {

    @Query("SELECT u FROM Auto u WHERE u.color = :status and u.marca = :name")
    public Auto getOneUserBdd2(@Param("status") String status, @Param("name") String name);


    @Query(
            value = "SELECT * FROM Auto a WHERE a.id = 1",
            nativeQuery = true)
    public List<Auto> getAllAutosBdd() ;
    @Query(
            value = "SELECT * FROM Auto ORDER BY id",
            countQuery = "SELECT count(*) FROM Auto",
            nativeQuery = true)
    public List<Auto> getAllAutosBddOrdenado() ;

    @Query(
            value = "SELECT * FROM Auto u WHERE u.status = ?1",
            nativeQuery = true)
    public Auto getOneUserBdd(Integer status);


}
