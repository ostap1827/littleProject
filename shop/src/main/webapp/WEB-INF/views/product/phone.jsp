<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">

<c:forEach items="${productsByCategory}" var="product">
	<div class="product_frame">
		<div class="product_image">image</div>
		<label>${product.productName}</label>
		<h5>${product.reference}</h5>
		<h3>${product.price}</h3>
	</div>

</c:forEach>


