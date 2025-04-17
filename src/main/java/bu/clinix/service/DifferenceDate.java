package bu.clinix.service;

import java.time.*;
import java.util.*;



import bu.clinix.entities.AccueilConsultExt;
import bu.clinix.entities.AccueilHospitalisation;
import bu.clinix.entities.Acte;
import bu.clinix.entities.BanqueSang;
import bu.clinix.entities.Examen;
import bu.clinix.entities.GynecoObstetrique;
import bu.clinix.entities.Patient;
import bu.clinix.entities.T_trace;
import bu.clinix.entities.Transfusion;



// Java program for the above approach
public class DifferenceDate
{
	
	
	/**
	 * generateObjectTrace
	 */
	public static List<T_trace> generateObjectTrace(Patient patient){
		
		List<T_trace>	t_traces = new ArrayList<T_trace>();
		
	  try {
	    System.out.println("______________________accueilConsultExts___________debut");
	    
	    //System.out.println("---------------size Accueil"+ patient.getAccueilConsultExts().size());
	    //System.out.println("---------------chef famille"+patient.getAccouchements().get(0).getChefFamille());

//	    for (int index = 0; index <patient.getAccueilConsultExts().size(); index++) {
//	      AccueilConsultExt element =patient.getAccueilConsultExts().get(index);
//	      T_trace trace = new T_trace(element.getAccueilConsultExt_id(), "Accueil Consultation Externe", element.getDateConsult());
//	      t_traces.add(trace);
//	      System.out.println("________________________accueilConsultExts__________________fin");
//	      
//	    }
	    
	    for(AccueilConsultExt element: patient.getAccueilConsultExts())
	    { 
	    	System.out.println("______________________accueilConsultExts_______for____debut");
	    		//t_traces.add(new T_trace((long) 15, "Chao !!!", new Date()));
	    		System.out.println("______________apres 1 enreg________accueilConsultExts_______for____debut");
		      T_trace trace = new T_trace(element.getAccueilConsultExt_id(), "Accueil Consultation Externe", element.getDateConsult());
		      System.out.println("_______________apres____trace___accueilConsultExts_______for____debut");
		      t_traces.add(trace);
		      System.out.println("_________apres___traces__________accueilConsultExts_______for____debut");
		      System.out.println("________________________accueilConsultExts__________________fin");
	    }
	    
	  } catch (Exception error) {
	    System.out.println(error);
	    System.out.println("_______________accueilConsultExts_____Except");
	    
	  }
	  
	  try {
		    System.out.println("______________________accueilHosp___________debut");
		    

		    for (int index = 0; index <patient.getAccueilHospitalisations().size(); index++) {
		      AccueilHospitalisation element =patient.getAccueilHospitalisations().get(index);
		      T_trace trace = new T_trace(element.getAccueilHosp_id(), "Accueil Hospitalisation", element.getDateConsult());
		      t_traces.add(trace);
		      System.out.println("________________________accueilHosp__________________fin");
		      
		    }
		  } catch (Exception error) {
		    System.out.println(error);
		    System.out.println("_______________accueilHops_____Except");
		    
		  }
	  
	  try {
		    System.out.println("______________________Actes___________debut");
		    

		    for (int index = 0; index <patient.getActes().size(); index++) {
		      Acte element =patient.getActes().get(index);
		      T_trace trace = new T_trace(element.getActe_id(), "Acte", null);
		      t_traces.add(trace);
		      System.out.println("________________________Actes__________________fin");
		      
		    }
		  } catch (Exception error) {
		    System.out.println(error);
		    System.out.println("_______________Actes_____Except");
		    
		  }
	  
	  
	  
	  try {
		    System.out.println("______________________BanqueSangs___________debut");
		    

		    for (int index = 0; index <patient.getBanqueSangs().size(); index++) {
		      BanqueSang element =patient.getBanqueSangs().get(index);
		      T_trace trace = new T_trace(element.getBanqueSang_id(), "Banque du sang", element.getHeureDemande());
		      t_traces.add(trace);
		      System.out.println("________________________BanqueSangs__________________fin");
		      
		    }
		  } catch (Exception error) {
		    System.out.println(error);
		    System.out.println("_______________BanqueSangs_____Except");
		    
		  }
	  
	  try {
		    System.out.println("______________________Examens___________debut");
		    

		    for (int index = 0; index <patient.getExamens().size(); index++) {
		      Examen element =patient.getExamens().get(index);
		      T_trace trace = new T_trace(element.getExamen_id(), "Examen", element.getDateEnregistre());
		      t_traces.add(trace);
		      System.out.println("________________________Examens__________________fin");
		      
		    }
		  } catch (Exception error) {
		    System.out.println(error);
		    System.out.println("_______________Examens_____Except");
		    
		  }
	   
	  
	  try {
		    System.out.println("______________________GynecoObstetriques___________debut");
		    

		    for (int index = 0; index <patient.getGynecoObstetriques().size(); index++) {
		      GynecoObstetrique element =patient.getGynecoObstetriques().get(index);
		      T_trace trace = new T_trace(element.getGynocoObstetrique_id(), "Gyneco Obstetrique", element.getDateSortie());
		      t_traces.add(trace);
		      System.out.println("________________________GynecoObstetriques__________________fin");
		      
		    }
		  } catch (Exception error) {
		    System.out.println(error);
		    System.out.println("_______________GynecoObstetriques_____Except");
		    
		  }
	  
	  
	  try {
		    System.out.println("______________________Transfusions___________debut");
		    

		    for (int index = 0; index <patient.getTransfusions().size(); index++) {
		      Transfusion element =patient.getTransfusions().get(index);
		      T_trace trace = new T_trace(element.getTransfusion_id(), "Transfusion", element.getHeureDemande());
		      t_traces.add(trace);
		      System.out.println("________________________Transfusions__________________fin");
		      
		    }
		  } catch (Exception error) {
		    System.out.println(error);
		    System.out.println("_______________Transfusions_____Except");
		    
		  }
	  
	  for (T_trace t_trace : t_traces)
	{
		System.out.println("---------numero:"+t_trace.getNumero());
		System.out.println("---------service:"+t_trace.getService());
		
		System.out.println("_________________________________________");
	}
	  
	  return t_traces;
	}

	  
	// La fonction pour calculer la difference de 2 dates et return la periode 
	    static String findDifference(LocalDate start_date, LocalDate end_date)
	    {
	    	 String age;
	    	 
	    	// trouver la periode entre start_date et end-date
	        Period diff= Period.between(start_date, end_date);
	       
	  
	        // Les probabilites: Solution selon le cas 
	        if(diff.getYears()<0 || diff.getMonths()<0 || diff.getDays()<0)
	        {
	        	 age = "inexistant";
	        }

	        else if(diff.getYears()==0 && diff.getMonths()==0)
	        {
	    	       age =diff.getDays()+"j";
	        }
	        else if(diff.getYears()==0)
	        {
	        	if(diff.getDays()==0)
	        	{
	        		age = diff.getMonths()+"m";
	        	}
	        	else
	        	{
	        		age = diff.getMonths()+"m et "+diff.getDays()+"j";
	        	}
	        }
	        
	        else
	        {
	        	if(diff.getYears()>0 && diff.getYears()<6)
	        	{
	        		if(diff.getMonths()==0)
	        		{
	        			age = diff.getYears()*12+"m";
	        		}
	        		else
	        		{
	        			age = (diff.getYears()*12)+diff.getMonths()+"m";
	        		}
	        		
	        	}
	        	else if (diff.getYears()>5)
	        	{
	        		age = diff.getYears()+"a";
	        	}
	        	else
	        	{
	        		age = "inexistant";
	        	}
	        }
	        return age;
	    }
	    
	 // La fonction pour calculer la difference de 2 dates et return la periode 
	    static String findGroupeAge(LocalDate start_date, LocalDate end_date)
	    {
	    	 String groupeAge;
	    	 
	    	// trouver la periode entre start_date et end-date
	        Period diff= Period.between(start_date, end_date);

	  
	        // Les probabilites: Solution selon le cas 
	        if(diff.getYears()<0 || diff.getMonths()<0 || diff.getDays()<0)
	        {
	        	 groupeAge = "inexistant";
	        }
	        else if(diff.getYears()==0)
	        {
	        	groupeAge = "A";
	        }
	        
	        else if(diff.getYears()<5)
	        {
	        	groupeAge = "B";
	        }
	        else if(diff.getYears()>4 && diff.getYears()<10)
	        {
	        	groupeAge = "C";
	        }
	        else if(diff.getYears()>9 && diff.getYears()<15)
	        {
	        	groupeAge = "D";
	        }
	        else if(diff.getYears()>14 && diff.getYears()<20)
	        {
	        	groupeAge = "E";
	        }
	        else if(diff.getYears()>19 && diff.getYears()<25)
	        {
	        	groupeAge = "F";
	        }
	        else if(diff.getYears()>24 && diff.getYears()<30)
	        {
	        	groupeAge = "G";
	        }
	        else if(diff.getYears()>29 && diff.getYears()<35)
	        {	
	        	groupeAge = "H";
	        }
	        else if(diff.getYears()>34 && diff.getYears()<40)
	        {
	        	groupeAge = "I";
	        }
	        else if(diff.getYears()>39 && diff.getYears()<45)
	        {
	        	groupeAge = "J";
	        }
	        else if(diff.getYears()>44 && diff.getYears()<50)
	        {
	        	groupeAge = "K";
	        }
	        else 
	        {
	        	groupeAge = "L";
	        }
	        
	        return groupeAge;

	    }
	    
	  
}
