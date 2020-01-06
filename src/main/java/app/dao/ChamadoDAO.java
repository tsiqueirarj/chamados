package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("ChamadoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ChamadoDAO extends JpaRepository<Chamado, java.lang.String> {

  /**
   * Obtém a instância de Chamado utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Chamado entity WHERE entity.id = :id")
  public Chamado findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Chamado utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Chamado entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key usuario
   * @generated
   */
  @Query("SELECT entity FROM Chamado entity WHERE entity.usuario.id = :id")
  public Page<Chamado> findChamadosByUsuario(@Param(value="id") java.lang.String id, Pageable pageable);

}
