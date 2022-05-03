package com.example.demo.Repositories;

import java.util.Collection;

import com.example.demo.Model.Punto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntoRepository extends JpaRepository<Punto,Long>{

    @Query(nativeQuery = true, value = "SELECT * FROM punto WHERE SQRT(POW(X,2)+POW(Y,2)) = (SELECT MIN(SQRT(POW(X,2)+POW(Y,2))) FROM punto);")
    Punto findClosest();

    @Query(nativeQuery = true, value ="SELECT AVG(SQRT(POW(X,2)+POW(Y,2))) FROM punto")
    double findAverage();

    @Query(nativeQuery = true, value="SELECT * FROM punto WHERE activo = true")
    Collection<Punto> findAllActive();

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE punto SET activo=false,del_time=CURRENT_TIMESTAMP WHERE id = :id")    
    void logicDelete(@Param("id")long id);

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE punto SET activo=true,del_time=null WHERE id=:id")
    void undo(@Param("id")long id);

    @Query(nativeQuery = true, value = "SELECT id FROM punto WHERE del_time=(SELECT MAX(del_time) from punto)")
    long lastDeleted();
    
}
