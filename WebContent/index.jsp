<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="menu.jsp" %>



    <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">FrikiLibros</h1>
                </div>
                <section class="col-lg-3 col-md-4 col-sm-6 elementoLibro">
            	
	            	<figure>
	            	<a href="Servlet?isbn=720&opcion=buscarLibro">
		                <img src="imagenes/720.jpg"/>
		            </a>
		                <figcaption>
		                   Apocalipsis Z
		                </figcaption>
	             	</figure>
             	
             </section>
             <section class="col-lg-3 col-md-4 col-sm-6 elementoLibro">
            	
	            	<figure>
	            	<a href="Servlet?isbn=720&opcion=buscarLibro">
		                <img src="imagenes/303.jpg"/>
		            </a>    
		                <figcaption>
		                   Fundación 
		                </figcaption>
	             	</figure>
             	
             </section>
             <section class="col-lg-3 col-md-4 col-sm-6 elementoLibro">
            	
	            	<figure>
	            	<a href="Servlet?isbn=720&opcion=buscarLibro">
		                <img src="imagenes/62.jpg"/>
		             </a>   
		                <figcaption>
		                   La maquina de los presagios
		                </figcaption>
	             	</figure>
             	
             </section>
            </div>
        </div>


<%@ include file ="footer.html" %>