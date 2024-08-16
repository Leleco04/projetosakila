<%-- Document : sakila Created on : 13/08/2024, 15:17:53 Author : Senai --%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@page contentType="text/html" pageEncoding="UTF-8" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
                    integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
                    crossorigin="anonymous">
                <title>JSP Page</title>
            </head>

            <body>
                <h1>Hello World!</h1>
                <a href="./cadastrar">Link</a>

                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Nome</th>
                            <th scope="col">Descrição</th>
                            <th scope="col">Ano de lançamento</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach begin="1000" var="filme" items="${filmes}">
                            <tr>
                                <td scope="row">${filme.film_id}</td>
                                <td>${filme.title}</td>
                                <td>${filme.description}</td>
                                <td>${filme.release_date}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
                    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
                    crossorigin="anonymous"></script>
            </body>

            </html>