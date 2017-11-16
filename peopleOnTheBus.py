def number(bus_stops):
    OnBus = 0;#number of people on bus
    for x in range(0, len(bus_stops)): # loops through each stop
        OnBus += bus_stops[x][0]; #add people getting on bus
        OnBus -= bus_stops[x][1]; #subtract people getting off
    return OnBus; #return final total on bus

test.assert_equals(number([[10,0],[3,5],[5,8]]),5)
test.assert_equals(number([[3,0],[9,1],[4,10],[12,2],[6,1],[7,10]]),17)
test.assert_equals(number([[3,0],[9,1],[4,8],[12,2],[6,1],[7,8]]),21)
