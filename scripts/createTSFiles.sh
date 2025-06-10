#!/bin/sh
X=1
XEND=1

while [ $X -le $XEND ]
do
 sed 's/Z/'${X}'/g' scripts/TrialServletZ.java > src/main/java/myservlets/TrialServlet${X}.java
 X=`expr $X + 1`
done
