<%-- 
    Document   : cadastrar
    Created on : 13/08/2024, 17:16:52
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>Cadastrar filme</title>
        <style>
            #formulario {
                width: 25%;
            }
        </style>
    </head>
    <body>
        <h1 class="text-center mb-5 mt-5">Cadastro</h1> 
            <form action="./cadastrar" method="POST" id="formulario" class="m-auto">
                <div class="d-grid">
                    <div class="form-floating mb-3 row">
                        <input text="text" class="form-control" id="floatingInput" name="title"
                               placeholder="Nome do Filme">
                        <label for="floatingInput">Nome do filme</label>
                    </div>
                    <div class="form-floating mb-3 row">
                        <input type="text" class="form-control" id="floatingInput" name="description"
                               placeholder="Descrição">
                        <label for="floatingInput">Descrição</label>
                    </div>
                    <div class="form-floating mb-3 row">
                        <input type="number" class="form-control" id="floatingInput" name="release_year"
                               placeholder="Ano de lançamento">
                        <label for="floatingInput">Ano de lançamento</label>
                    </div>
                    <button type="submit" class="btn btn-danger">Cadastrar filme</button>
                </div>
            </form>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
    </body>
</html>
