package com.dia20.lectura21.Controller.Repository;

import com.dia20.lectura21.Model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  AutoRepository  extends JpaRepository<Auto, Integer> {


}
