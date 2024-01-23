<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
	<nav class="site-navigation text-right text-md-right">

              <ul class="site-menu js-clone-nav d-none d-lg-block">
                <li class="active">
                  <a href='<c:url value="/Accueil"/>'>Accueil</a>
                </li>
                <li><a href='<c:url value="/Galeries"/>'>Galeries</a></li>
                <li class="has-children">
                  <a href="players.html">Joueurs</a>
                  <ul class="dropdown arrow-top">
                    <li><a href='<c:url value="/Galeries"/>'>Nos Joueurs</a></li>
                    <li><a href='<c:url value="/Galeries"/>'>Staff</a></li>
                    <li><a href='<c:url value="/Inscriptions"/>'>S'inscrire au Club</a></li>
                    <li class="has-children">
                      <a href="#">Match</a>
                      <ul class="dropdown">
                        <li><a href="#">Joshua Fugueroa</a></li>
                        <li><a href="#">Jakub Bates</a></li>
                        <li><a href="#">Russell Vance</a></li>
                        <li><a href="#">Carson Hodgson</a></li>
                      </ul>
                    </li>
                  </ul>
                </li>
                <li><a href="events.html">Events</a></li>
                <li><a href="about.html">About</a></li>
                <li><a href='<c:url value="/Contacts"/>'>Contact</a></li>
              </ul>

              <a href="#" class="site-menu-toggle js-menu-toggle text-black d-inline-block d-lg-none"><span class="icon-menu h3"></span></a>
            </nav>
</body>
</html>