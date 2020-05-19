/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.aut.utcluj.isp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.aut.utcluj.isp.ex1.PersonTest;
import java.aut.utcluj.isp.ex2.EmployeeTest;
import java.aut.utcluj.isp.ex3.EmployeeControllerTest;
import java.aut.utcluj.isp.ex4.SalaryInfoTest;

/**
 * @author stefan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        PersonTest.class,
        EmployeeTest.class,
        EmployeeControllerTest.class,
        java.aut.utcluj.isp.ex4.EmployeeTest.class,
        SalaryInfoTest.class
})
public class ColocviuTestSuite {

}
