lcv = -13
puts "X\tY"
while lcv < 16
    lcv += 1
    answer = lcv**6 - 3*lcv**5 - 93*lcv**4 + 87*lcv**3 + 1596*lcv**2 - 1380*lcv - 2800
    puts lcv.to_s + "\t" + answer.to_s
end
=begin
X	Y
-12	1897280
-11	982800
-10	453600
-9	173888
-8	45360
-7	0
-6	-6400
-5	0
-4	6048
-3	7280
-2	4320
-1	0
0	-2800
1	-2592
2	0
3	2240
4	0
5	-10800
6	-32032
7	-60480
8	-84240
9	-78400
10	0
11	217728
12	671840
13	1496880
14	2872800
15	5033600
16	8276688
=end