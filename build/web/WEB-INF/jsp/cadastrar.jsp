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
        <link rel="stylesheet" href="./styles/styles.css">
    </head>
    <body>
        <header>
            <nav class="navbar navbar-expand-lg bg-body-tertiary">
                <div class="container-fluid">
                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="red" class="bi bi-1-circle me-3" viewBox="0 0 16 16">
                    <path d="M1 8a7 7 0 1 0 14 0A7 7 0 0 0 1 8m15 0A8 8 0 1 1 0 8a8 8 0 0 1 16 0M9.283 4.002V12H7.971V5.338h-.065L6.072 6.656V5.385l1.899-1.383z"/>
                    </svg>
                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="./sakila">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="./cadastrar">Cadastrar</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>       
        <div class="d-flex justify-content-center align-items-center cadastro-container">
            <form action="./cadastrar" method="POST" id="formulario">
                <h1 class="text-center mb-5 titulo">Cadastrar Filme</h1>   
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
                    <div class="d-flex justify-content-center">
                        <button type="submit" class="btn btn-danger w-50 mt-3">Cadastrar filme</button>
                    </div>
                </div>   
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
    </body>
</html>
