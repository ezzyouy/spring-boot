<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link
        href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
        rel="stylesheet" id="bootstrap-css">
<script
        src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link href='//fonts.googleapis.com/css?family=Roboto:100,400,300'
      rel='stylesheet' type='text/css'>
<link rel="stylesheet"
      href="//maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<style>
    * {
        box-sizing: border-box;
    }
    *:hover, *:focus {
        outline: 0
    }
    html {
        height: 100%;
    }
    body {
        position: relative;
        height: 100%;
        background: rgba(0, 0, 0, .3);
        font-family: 'Roboto', sans-serif;
        font-weight: 300;
        font-size: 17px;
        color: #777;
    }
    button, select, input {
        font-family: 'Roboto', sans-serif;
        font-size: 17px;
    }
    .quiz-window {
        position: absolute;
        left: 0;
        right: 0;
        top: 50px;
        margin: auto;
        width: 800px;
        border-radius: 4px;
        background: #fff;
        overflow: hidden;
    }
    .quiz-window-header {
        padding: 20px 15px;
        position: relative;
    }
    .quiz-window-title {
        font-size: 26px;
    }
    .quiz-window-close {
        position: absolute;
        top: 20px;
        right: 20px;
        padding: 0;
        background: none;
        border: 0;
        width: 30px;
        height: 30px;
        font-size: 60px;
        font-weight: 100;
        line-height: 24px;
        color: #777;
        cursor: pointer;
    }
    .quiz-window-body {
        background-color: #f9f9f9;
    }
    .guiz-awards-row {
        margin: 0;
        padding: 10px 20px;
        list-style: none;
    }
    .guiz-awards-row:after {
        content: '';
        display: table;
        clear: both;
    }
    .guiz-awards-row-even {
        background-color: #fff;
    }
    .guiz-awards-row li {
        vertical-align: top;
        float: left;
    }
    .guiz-awards-header {
        padding: 20px 40px;
    }
    .guiz-awards-star, .guiz-awards-track, .guiz-awards-time,
    .guiz-awards-header-star, .guiz-awards-header-track,
    .guiz-awards-header-time {
        min-width: 54px;
        width: 16%;
    }
    .guiz-awards-title {
        width: 20%;
        font-size: 18px;
        font-weight: normal;
        padding-top: 3px;
    }
    .guiz-awards-header-title {
        width: 20%;
    }
    .guiz-awards-subtitle {
        color: #858585;
        font-size: 14px;
        font-weight: 300;
    }
    .guiz-awards-track, .guiz-awards-time {
        width: 22%;
        min-width: 80px;
        font-size: 18px;
        line-height: 45px
    }
    .guiz-awards-header-track, .guiz-awards-header-time {
        width: 22%;
        min-width: 80px;
    }
    .guiz-awards-track .null, .guiz-awards-time .null {
        color: #bababa;
    }
    .star {
        display: block;
        width: 50px;
        height: 50px;
        border-radius: 50%;
        border: 2px solid #bdc2c1;
        background: #d6d6d6;
    }
    .goldstar {
        border-color: #4c8193;
        background: #14b0bf;
    }
    .silverstar {
        border-color: #557e3a;
        background: #66931f;
    }
    .bronzestar {
        border-color: #998247;
        background: #aa984b;
    }
    .rhodiumstar {
        border-color: #743a7f;
        background: #a0409d;
    }
    .platinumstar {
        border-color: #10393b;
        background: #2b5770;
    }
    .guiz-awards-buttons {
        background: #fff;
        text-align: center;
        padding: 20px 0;
    }
    .guiz-awards-but-back {
        display: inline-block;
        background: none;
        border: 1px solid #61a3e5;
        border-radius: 21px;
        padding: 7px 40px 7px 20px;
        color: #61a3e5;
        font-size: 17px;
        cursor: pointer;
        transition: all .3s ease;
    }
    .guiz-awards-but-back:hover {
        background: #61a3e5;
        color: #fff;
    }
    .guiz-awards-but-back i {
        font-size: 26px;
        line-height: 17px;
        margin-right: 20px;
        position: relative;
        top: 2px;
    }
    a.btn:hover {
        -webkit-transform: scale(1.1);
        -moz-transform: scale(1.1);
        -o-transform: scale(1.1);
    }
    a.btn {
        -webkit-transform: scale(0.8);
        -moz-transform: scale(0.8);
        -o-transform: scale(0.8);
        -webkit-transition-duration: 0.5s;
        -moz-transition-duration: 0.5s;
        -o-transition-duration: 0.5s;
    }
</style>

<div class="quiz-window">

    <div class="quiz-window-header">
        <div class="quiz-window-title">
            Gestion Facture <a href="<c:url value="/logout" />">Logout</a>
        </div>
        <button class="quiz-window-close">&times;</button>
    </div>
    <div class="quiz-window-body">
        <div class="col2">
            <f:form modelAttribute="k" action="../factures/crud">
                <f:label path="id">id</f:label>
                <f:input path="id" maxlength="19" placeholder="id" />
                <label>montant</label>
                <f:input path="montant" maxlength="19" placeholder="montant" />
                <label>description</label>
                <f:input path="description" maxlength="19" placeholder="description" />
                <div class="guiz-awards-buttons">
                    <button class="guiz-awards-but-back" name="add">Add Facture</button>
                    <button class="guiz-awards-but-back" name="update">update Facture</button>
                </div>
            </f:form>
        </div>
        <div>
            <c:if test="${not empty list}">
                <ul class="guiz-awards-row guiz-awards-header">
                    <li class="guiz-awards-header-title">Photo</li>
                    <li class="guiz-awards-header-title">Id</li>
                    <li class="guiz-awards-header-title">montant</li>
                    <li class="guiz-awards-header-title">description</li>
                    <li class="guiz-awards-header-title">Actions</li>

                </ul>
                <c:forEach items="${list}" var="f">
                    <ul class="guiz-awards-row guiz-awards-row-even">
                        <li class="guiz-awards-star"><span class="star goldstar"></span></li>
                        <li class="guiz-awards-title">${f.id}</li>
                        <li class="guiz-awards-title">${f.montant}</li>
                        <li class="guiz-awards-title">${f.description}</li>

                        <li class="guiz-awards-track"></li>
                        <a
                                href="${pageContext.request.contextPath}/factures/update/${f.id}"
                                class="btn btn-primary a-btn-slide-text"> <span
                                class="glyphicon glyphicon-edit" aria-hidden="true"></span> <span><strong>Edit</strong></span>
                        </a>

                        <a
                                href="${pageContext.request.contextPath}/factures/delete/${f.id}"
                                class="btn btn-primary a-btn-slide-text"> <span
                                class="glyphicon glyphicon-remove" aria-hidden="true"></span> <span><strong>Delete</strong></span>
                        </a>
                        </li>
                    </ul>
                </c:forEach>
            </c:if>
        </div>
        <div class="guiz-awards-buttons">
            <button class="guiz-awards-but-back">
                <i class="fa fa-angle-left"></i> Back
            </button>
        </div>
    </div>
</div>