/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.beataannawiec.crudapp;


import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Animka
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
