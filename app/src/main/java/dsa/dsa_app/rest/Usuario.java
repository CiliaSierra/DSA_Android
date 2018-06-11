package dsa.dsa_app.rest;

import dsa.dsa_app.map.Views;

import com.fasterxml.jackson.annotation.JsonView;


public class Usuario {

    @JsonView(Views.Normal.class)
    private int id;
    @JsonView(Views.Normal.class)
    private String nombre;
    @JsonView(Views.Normal.class)
    private String password;
    @JsonView(Views.Normal.class)
    private String email;
    @JsonView(Views.Normal.class)
    private int Obj1;
    @JsonView(Views.Normal.class)
    private int Obj2;
    @JsonView(Views.Normal.class)
    private int Obj3;
    @JsonView(Views.Normal.class)
    private int Obj4;

    //Constructores

    public Usuario(int id, String nombre, String password, String email){
        this.setId(id);
        this.setNombre(nombre);
        this.setPassword(password);
        this.setEmail(email);
        this.Obj1=0;
        this.Obj2=0;
        this.Obj3=0;
        this.Obj4=0;
    }

    public Usuario(String nombre, String password, String email){
        //funcio per que en les proves on no es posa un id el codi no peti
        new Usuario(1, nombre,password,email);
    }

    public Usuario(){

     }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + " Password: " + getPassword();
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getObj1() {
        return Obj1;
    }

    public void setObj1(int obj1) {
        Obj1 = obj1;
    }

    public int getObj2() {
        return Obj2;
    }

    public void setObj2(int obj2) {
        Obj2 = obj2;
    }

    public int getObj3() {
        return Obj3;
    }

    public void setObj3(int obj3) {
        Obj3 = obj3;
    }

    public int getObj4() {
        return Obj4;
    }

    public void setObj4(int obj4) {
        Obj4 = obj4;
    }

}