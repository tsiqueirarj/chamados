package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CHAMADO
 * @generated
 */
@Entity
@Table(name = "\"CHAMADO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Chamado")
public class Chamado implements Serializable {

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
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data_inicio", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data_inicio;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data_fim", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data_fim;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_usuario", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Usuario usuario;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIME)
  @Column(name = "hora_inicio", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date hora_inicio;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIME)
  @Column(name = "hora_fim", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date hora_fim;

  /**
  * @generated
  */
  @Column(name = "solucao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String solucao;

  /**
  * @generated
  */
  @Column(name = "historico", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String historico;

  /**
   * Construtor
   * @generated
   */
  public Chamado(){
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
  public Chamado setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  
  public java.lang.String getDescricao(){
    return this.descricao;
  }

  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public Chamado setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * Obtém data_inicio
   * return data_inicio
   * @generated
   */
  
  public java.util.Date getData_inicio(){
    return this.data_inicio;
  }

  /**
   * Define data_inicio
   * @param data_inicio data_inicio
   * @generated
   */
  public Chamado setData_inicio(java.util.Date data_inicio){
    this.data_inicio = data_inicio;
    return this;
  }

  /**
   * Obtém data_fim
   * return data_fim
   * @generated
   */
  
  public java.util.Date getData_fim(){
    return this.data_fim;
  }

  /**
   * Define data_fim
   * @param data_fim data_fim
   * @generated
   */
  public Chamado setData_fim(java.util.Date data_fim){
    this.data_fim = data_fim;
    return this;
  }

  /**
   * Obtém usuario
   * return usuario
   * @generated
   */
  
  public Usuario getUsuario(){
    return this.usuario;
  }

  /**
   * Define usuario
   * @param usuario usuario
   * @generated
   */
  public Chamado setUsuario(Usuario usuario){
    this.usuario = usuario;
    return this;
  }

  /**
   * Obtém hora_inicio
   * return hora_inicio
   * @generated
   */
  
  public java.util.Date getHora_inicio(){
    return this.hora_inicio;
  }

  /**
   * Define hora_inicio
   * @param hora_inicio hora_inicio
   * @generated
   */
  public Chamado setHora_inicio(java.util.Date hora_inicio){
    this.hora_inicio = hora_inicio;
    return this;
  }

  /**
   * Obtém hora_fim
   * return hora_fim
   * @generated
   */
  
  public java.util.Date getHora_fim(){
    return this.hora_fim;
  }

  /**
   * Define hora_fim
   * @param hora_fim hora_fim
   * @generated
   */
  public Chamado setHora_fim(java.util.Date hora_fim){
    this.hora_fim = hora_fim;
    return this;
  }

  /**
   * Obtém solucao
   * return solucao
   * @generated
   */
  
  public java.lang.String getSolucao(){
    return this.solucao;
  }

  /**
   * Define solucao
   * @param solucao solucao
   * @generated
   */
  public Chamado setSolucao(java.lang.String solucao){
    this.solucao = solucao;
    return this;
  }

  /**
   * Obtém historico
   * return historico
   * @generated
   */
  
  public java.lang.String getHistorico(){
    return this.historico;
  }

  /**
   * Define historico
   * @param historico historico
   * @generated
   */
  public Chamado setHistorico(java.lang.String historico){
    this.historico = historico;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Chamado object = (Chamado)obj;
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
