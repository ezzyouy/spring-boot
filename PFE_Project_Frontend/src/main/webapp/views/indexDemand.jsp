<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>--%>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <!-- Brand -->
    <a class="navbar-brand" href="#">Logo</a>

    <!-- Links -->
    <ul class="navbar-nav">
        <li class="nav-item">
            <a class="nav-link" href="#">Link 1</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Link 2</a>
        </li>

        <!-- Dropdown -->
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                Dropdown link
            </a>
            <div class="dropdown-menu">
                <a class="dropdown-item" href="#">Link 1</a>
                <a class="dropdown-item" href="#">Link 2</a>
                <a class="dropdown-item" href="#">Link 3</a>
            </div>
        </li>
    </ul>
</nav>
<div class="container" style="    margin-top: 10px;
">
    <div>
    </div>
    <div class="card text-center">
        <div class="card">
            <div class="card-header">Gestion demands</div>
            <div class="card-body">

                <f:form action="../demands/crud" modelAttribute="demandKey">
                <div class="form-group">
                    <label>Id :</label>
                    <f:input path="id" maxlength="19" cssClass="form-control" class="form-control" placeholder="id"/>
                </div>
                <div class="form-group">
                    <label>Compte :</label>
                    <f:input path="compte" maxlength="19" cssClass="form-control" class="form-control" placeholder="Cin"/>
                </div>
                <div class="form-group">
                    <label>Nombre :</label>
                    <f:input path="nb" maxlength="19" cssClass="form-control" class="form-control" placeholder="id"/>
                </div>
            </div>
            <div class="row" style="margin-left: 10px">
                <button type="submit" name="add" class="btn btn-primary" style="width: 100px">Submit</button>
                <button type="submit" name="update" class="btn btn-primary" style="width: 100px">Update</button>
            </div>

            </f:form>

            <table class="table">
                <thead class="thead-dark">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Compte</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">CLIENT</th>
                    <th scope="col">ACTIONS</th>
                </tr>
                </thead>
                <tbody>

                <c:if test="${not empty listDemand}">
                    <c:forEach items="${listDemand}" var="dmnd">
                        <tr>
                            <td>${dmnd.id }</td>
                            <td>${dmnd.nom }</td>
                            <td>${dmnd.cin }</td>
                            <td>${dmnd.cin }</td>
                            <td><a
                                    href="${pageContext.request.contextPath}/demands/update/${dmnd.id}"
                                    class="btn btn-primary a-btn-slide-text"> <span
                                    class="glyphicon glyphicon-edit" aria-hidden="true"></span>
                                <span><strong>Edit</strong></span>
                            </a>
                                <a
                                        href="${pageContext.request.contextPath}/demands/delete/${dmnd.id}"
                                        class="btn btn-primary a-btn-slide-text"> <span
                                        class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                    <span><strong>Delete</strong></span>
                                </a></td>
                        </tr>
                    </c:forEach>
                </c:if>

                </tbody>
            </table>
        </div>
    </div>
    <div class="card-footer"></div>
</div>
</div>
</body>
</html>