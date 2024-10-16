def say_night(name)
    re = "Good Night, #{name.capitalize}"
    return re
end
def lists
    a = %w{ Dog Cat Bee Ant }
    return a[0] + " " + a[3]
end

inst_section = {
    cello:    'sting',
    clarinet: 'woodwind'
}
puts inst_section[:cello]

today = Time.now

if today.saturday?
    puts "Today is Saturday"
elsif today.sunday?
    puts "Today is Sunday"
else
    puts "Today is Weekday\t"
end


puts square = 4
puts square = square*square while square < 1000


plain_string = "dog"

puts RUBY_VERSION
