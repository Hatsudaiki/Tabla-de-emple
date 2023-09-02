package com.empleados.david.models;

public class empleados {
   private String nombre;
   private String apellido;
   private String email;
   private int telefono;
   private String foto;

   public empleados() {
   }

   public empleados(String nombre, String apellido, String email, int telefono, String foto) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.telefono = telefono;
    this.foto = foto;    
   }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail(){
        return email;
    }

    public int getTelefono(){
        return telefono;
    }

    public String getFoto(){
        return foto;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public void setFoto(String foto){
        this.foto = foto;
    }



}
