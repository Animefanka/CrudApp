/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beataannawiec.task1.Repository;

import beataannawiec.task1.pojo.Book;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Animka
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
