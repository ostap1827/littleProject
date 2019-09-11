<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">

<c:forEach items="${products}" var="prod">
	<div class="product_frame">
	<div class="product_image">image</div>
		<label>${prod.productName}</label>
		<h5>${prod.reference}</h5>
		<h3>${prod.price}</h3>
	</div>

</c:forEach>