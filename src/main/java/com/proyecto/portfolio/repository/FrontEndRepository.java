/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.portfolio.repository;

import com.proyecto.portfolio.entity.FrontEnd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author marti
 */
@Repository
public interface FrontEndRepository extends JpaRepository <FrontEnd, Integer> {
    
}
