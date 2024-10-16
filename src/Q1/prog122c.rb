lcv = 0
while lcv < 10
    lcv += 2
    puts lcv.to_s + "\t" + (lcv + lcv).to_s + "\t" + (lcv * 2).to_s + "\t" + (lcv * lcv).to_s
end
#2       4       4       4
#4       8       8       16
#6       12      12      36
#8       16      16      64
#10      20      20      100