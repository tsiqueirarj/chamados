package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiCloud;


/**
 * Classe que representa a tabela USUARIO
 * @generated
 */
@Entity
@Table(name = "\"USUARIO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Usuario")
public class Usuario implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "departamento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String departamento;

  /**
  * @generated
  */
  @Column(name = "cargo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cargo;

  /**
  * @generated
  */
  @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String email;

  /**
  * @generated
  */
  @Column(name = "foto", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="pBJ69NKzVPAAAAAAAAAA2fvFWF_Jy3OK5o7iQr0Fm1QW-CLdpCXlYM-NWb-eAxXN")
  
  private java.lang.String foto;

  /**
   * Construtor
   * @generated
   */
  public Usuario(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Usuario setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Usuario setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém departamento
   * return departamento
   * @generated
   */
  
  public java.lang.String getDepartamento(){
    return this.departamento;
  }

  /**
   * Define departamento
   * @param departamento departamento
   * @generated
   */
  public Usuario setDepartamento(java.lang.String departamento){
    this.departamento = departamento;
    return this;
  }

  /**
   * Obtém cargo
   * return cargo
   * @generated
   */
  
  public java.lang.String getCargo(){
    return this.cargo;
  }

  /**
   * Define cargo
   * @param cargo cargo
   * @generated
   */
  public Usuario setCargo(java.lang.String cargo){
    this.cargo = cargo;
    return this;
  }

  /**
   * Obtém email
   * return email
   * @generated
   */
  
  public java.lang.String getEmail(){
    return this.email;
  }

  /**
   * Define email
   * @param email email
   * @generated
   */
  public Usuario setEmail(java.lang.String email){
    this.email = email;
    return this;
  }

  /**
   * Obtém foto
   * return foto
   * @generated
   */
  
  public java.lang.String getFoto(){
    return this.foto;
  }

  /**
   * Define foto
   * @param foto foto
   * @generated
   */
  public Usuario setFoto(java.lang.String foto){
    this.foto = foto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Usuario object = (Usuario)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
