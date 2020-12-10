package controller;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;
import repository.Repository;
import model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class Controller {
    @Autowired
    Repository Repo;
    Model model;

    @GetMapping
    public List<Model> all(){
        return Repo.findAll();
    }

    @PostMapping("/add")
    public Model addNewModel(@RequestParam char cust_id, @RequestParam VarcharTypeDescriptor nama, @RequestParam
            VarcharTypeDescriptor alamat, @RequestParam VarcharTypeDescriptor id_kota, @RequestParam DecimalFormat
            pendapatan){

    Model n = new Model();
    n.setNama(nama);
    n.setCust_id(cust_id);
    n.setId_kota(id_kota);
    n.setAlamat(alamat);
    n.setPendapatan(pendapatan);
    return Repo.save(n);

    }


    @PutMapping("/{cust_id}")
    public <cust_id> Model update(@PathVariable="cust_id" char cust_id, @RequestParam VarcharTypeDescriptor nama, @RequestParam
            VarcharTypeDescriptor alamat, @RequestParam VarcharTypeDescriptor id_kota, @RequestParam DecimalFormat
                                     pendapatan){

        Model n = new Model();
        n.setNama(nama);
        n.setCust_id(cust_id);
        n.setId_kota(id_kota);
        n.setAlamat(alamat);
        n.setPendapatan(pendapatan);
        return Repo.save(n);


    }

    @DeleteMapping("/{cust_id}")
    public <cust_id> Model addNewModel(@PathVariable=cust_id, @RequestParam VarcharTypeDescriptor nama, @RequestParam
            VarcharTypeDescriptor alamat, @RequestParam VarcharTypeDescriptor id_kota, @RequestParam DecimalFormat
                                     pendapatan){

        Model n = new Model();
        n.setCust_id(cust_id);

        return Repo.delete(n);
    }

}
