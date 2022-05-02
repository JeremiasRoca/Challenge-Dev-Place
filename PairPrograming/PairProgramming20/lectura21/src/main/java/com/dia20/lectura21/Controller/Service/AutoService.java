package com.dia20.lectura21.Controller.Service;

import com.dia20.lectura21.Controller.Repository.AutoRepository;
import com.dia20.lectura21.Model.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService {

    @Autowired
    private AutoRepository ar;

    public List<Auto> getAllAutos(){
        return (List<Auto>) ar.findAll();
    }

    public Auto getOneUser(int id) {
        return ar.findById(id).get();
    }


    public boolean saveAuto(Auto auto) {
        ar.save(auto);
        return true;
    }

    public boolean deleteAuto(Auto user) {
        ar.delete(user);
        return true;
    }

}
