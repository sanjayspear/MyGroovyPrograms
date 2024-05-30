package com.test.demo

String a = 'Hello Single';
String b = "Hello Double";
String c = "'Hello Triple" + " Multiple lines'";
  
println(a.length());
println(b.indexOf("D"));
println(c);
println(c.toLowerCase());
println(c.concat(" <<<=======>>> "+a))

String x = "Hello-World";
String[] str;
str = x.split('-');

for( String values : str )
println(values);
