
package com.yoprogramo.proyectoportfolio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crisl
 */
public class ProyectoPortfolio {

    public static void main(String[] args) {
        
        Administrador persona = new Administrador();
        List <Educacion>listaEducacion = new ArrayList<Educacion> ();
        List <Proyecto>listaProyecto = new ArrayList<Proyecto> ();
        List <Habilidad>listaHabilidad = new ArrayList<Habilidad> ();
        persona.setListaEducacion(listaEducacion);
        persona.setListaProyecto(listaProyecto);
        persona.setListaHabilidad(listaHabilidad);
        persona.setUserId(1);
        persona.setNombre("Cristian");
        persona.setApellido("Guzmán");
        persona.setCorreo("cris.life121@gmail.com");
        persona.setContraseña("1234abc");
        persona.setCertificado("Full Stack Developer Jr.");
        persona.setDescripción("Soy desarrollador full stack Junior. Tengo conocimientos básicos e intermedios en el manejo de paquete office, editores de imagenes e inglés.");
        persona.setFoto("foto");
        persona.setFotoBanner("fotoBanner");
        persona.setLogInStatus(false);
        System.out.println(persona.getNombre());
        
        
        Educacion argPrograma = new Educacion();
        
        argPrograma.setId(1); 
        argPrograma.setNombre("Argentina Programa");    
        argPrograma.setTitulo("Desarrollador Full Stack Jr.");  
        argPrograma.setDescripcion("¿Qué es Argentina Programa? Una capacitación en programación gratuita y virtual organizada en dos etapas: #SéProgramar, en donde vas a aprender los fundamentos básicos para aprender a programar. #YoProgramo, en la que vas a profundizar tus conocimientos y capacitarte para convertirte en un programador web full stack junior. Las dos etapas cuentan con una certificación conjunta del Ministerio de Desarrollo Productivo y la Cámara Argentina de la Industria de Software (CESSI). La segunda etapa tiene además la certificación del Instituto Nacional de Tecnología Industrial (INTI)."); 
        argPrograma.setFechaTermino(31, 7, 2022);     
        argPrograma.setFoto("foto educacion");
        System.out.println(argPrograma.getFechaTermino());
        listaEducacion.add(argPrograma);
        listaEducacion.add(argPrograma);

        
        Proyecto miPortafolio = new Proyecto();
        
        miPortafolio.setId(1);
        miPortafolio.setNombre("Mi Portafolio");
        miPortafolio.setDescripcion("Este es mi primer proyecto web");
        miPortafolio.setFechaTermino(31, 8, 2022);
        miPortafolio.setFoto("foto proyecto");
        listaProyecto.add(miPortafolio);
        listaProyecto.add(miPortafolio);
        
        
        Habilidad html = new Habilidad();
        html.setId(1);
        html.setNombre("Html");
        listaHabilidad.add(html);
        
        Habilidad css = new Habilidad();
        css.setId(2);
        css.setNombre("Css");
        listaHabilidad.add(css);
        
        Habilidad js = new Habilidad();
        js.setId(3);
        js.setNombre("JavaScript");
        listaHabilidad.add(js);
        
        Habilidad ts = new Habilidad();
        ts.setId(4);
        ts.setNombre("TypeScript");
        listaHabilidad.add(ts);
        
        Habilidad bootstrap = new Habilidad();
        bootstrap.setId(5);
        bootstrap.setNombre("Bootstrap");
        listaHabilidad.add(bootstrap);
        
        Habilidad nodoJs = new Habilidad();
        nodoJs.setId(6);
        nodoJs.setNombre("nodoJs");
        listaHabilidad.add(nodoJs);
        
        Habilidad figma = new Habilidad();
        figma.setId(7);
        figma.setNombre("Figma");
        listaHabilidad.add(figma);
        
        Habilidad angular = new Habilidad();
        angular.setId(8);
        angular.setNombre("Angular");
        listaHabilidad.add(angular);
        
        Habilidad java = new Habilidad();
        java.setId(9);
        java.setNombre("Java");
        listaHabilidad.add(java);
        
        Habilidad git = new Habilidad();
        git.setId(10);
        git.setNombre("Git");
        listaHabilidad.add(git);
        
        Habilidad gitHub = new Habilidad();
        gitHub.setId(11);
        gitHub.setNombre("GitHub");
        listaHabilidad.add(gitHub);
        
        Habilidad mySQL = new Habilidad();
        mySQL.setId(12);
        mySQL.setNombre("MySQL");
        listaHabilidad.add(mySQL);
        
        Habilidad springBoot = new Habilidad();
        springBoot.setId(13);
        springBoot.setNombre("SpringBoot");
        listaHabilidad.add(springBoot);
        
        System.out.println(persona.toString());
        
    }
}
