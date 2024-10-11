print "Enter Length: "
length = gets.chop.to_i
print "Enter Width: "
width = gets.chop.to_i

area = length * width
perim = length * 2 + width * 2
puts "Area is: " + area.to_s + "\nPerimiter is: " + perim.to_s 
