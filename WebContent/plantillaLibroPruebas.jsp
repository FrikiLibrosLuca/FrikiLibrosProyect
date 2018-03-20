<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    
    <title>Plantilla Libros</title>
    
    <link rel="stylesheet" type="text/css" href="basico.css">
</head>

<body>

   <header>
       <h1>Información de Libros</h1>
   </header>
    <div id="cajaLibro">
        <div id="imagenLibro">
            <figure>
              <img src=${Libro.foto} alt="titulo del libro" width="304" height="228">
            </figure>
        </div>
        <div id="InfoLibro">
           <p id="ISBN">ISBN: <spam id="ISBNDatos">${Libro.ISBN}</spam></p>
           <p id="titulo">Titulo: <spam id="tituloDatos">${Libro.titulo}</spam></p>
           <p id="autor">Autor: <spam id="autorDatos"></spam>${Libro.autor.nombreAutor} ${Libro.autor.apellidoAutor}</p>
           <p id="saga">Saga: <spam id="saga"></spam>${Libro.saga}</p>
           <p id="fechaEdicion">Fecha de Edición: <spam id="fechaEdicionDatos">${Libro.fechaEdicion}</spam></p>
           <p id="idioma">Idioma: <spam id="idiomaDatos">${Libro.idioma}</spam></p>
           <p id="categoria">Categoría: <spam id="categoriaDatos">${Libro.categoria}</spam></p>                       
        </div>
    </div>
</body>

</html>