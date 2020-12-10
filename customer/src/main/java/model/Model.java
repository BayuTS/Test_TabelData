package model;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;
import java.text.DecimalFormat;

@Entity
@Table(name = "customer");
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cust_ID")
    private char cust_id;

    @Column(name = "Nama")
    private VarcharTypeDescriptor nama;

    @Column(name = "Alamat")
    private VarcharTypeDescriptor alamat;

    @Column(name = "ID_Kota")
    private VarcharTypeDescriptor id_kota;

    @Column(name = "Pendapatan")
    private DecimalFormat pendapatan;

    public Model() {
    }

    public char setCust_id(){
    return cust_id;
    }

    public VarcharTypeDescriptor setNama() {
        return nama;
    }

    public VarcharTypeDescriptor setAlamat() {
        return alamat;
    }

    public VarcharTypeDescriptor setId_kota() {
        return id_kota;
    }

    public DecimalFormat setPendapatan() {
        return pendapatan;
    }
}
