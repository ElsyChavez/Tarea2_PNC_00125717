package com.uca.capas.tarea2.controller;

import java.time.LocalDate;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/tarea2")
	public @ResponseBody String tarea2() {

		String nombre = "Elsy";
		String apellido = "Chavez";
		String carnet = "00125717";
		String carrera= "Ingenieria Informatica";
		String anio = "Cuarto";

		return "Nombre: " + nombre + "\n" +
				"Apellido: " + apellido + "\n" +
				"Carnet: " + carnet+ "\n" +
				"Carrera que estudia: " + carrera+ "\n" +
				"Año cursado: " + anio;
	}
	
	//Referencias usadas para este ejercicio: 
	//https://www.tutorialspoint.com/java/util/java_util_calendar.htm
	//https://docs.oracle.com/javase/8/docs/api/java/time/DayOfWeek.html
	@RequestMapping("/givendate")
	public @ResponseBody String parametro(HttpServletRequest request) {
		Integer param = Integer.parseInt(request.getParameter("dia"));
		Integer param2 = Integer.parseInt(request.getParameter("mes"));
		Integer param3 = Integer.parseInt(request.getParameter("anio"));
		
		Calendar cal = Calendar.getInstance();
		cal.set(param3, param2 -1, param);
		int DayName = cal.get(Calendar.DAY_OF_WEEK);
		String diaActual;
		
		switch(DayName) {
			case Calendar.MONDAY: diaActual = "Lunes";
			break;
			case Calendar.TUESDAY: diaActual = "Martes";
			break;
			case Calendar.WEDNESDAY: diaActual = "Miercoles";
			break;
			case Calendar.THURSDAY: diaActual = "Jueves";
			break;
			case Calendar.FRIDAY: diaActual = "Viernes";
			break;
			case Calendar.SUNDAY: diaActual = "Sabado";
			break;
			case Calendar.SATURDAY: diaActual = "Domingo";
			break;
			default: diaActual = "Ningun dia seleccionado";
			break;
		}
		
		return "Dia de la semana enviado: " + diaActual;
		
	}

}