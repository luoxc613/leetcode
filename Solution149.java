/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution149 {
    public int maxPoints(Point[] points) {
        if(points.length<=0) return 0;
        if(points.length<=2) return points.length;
        int result=0;
        for(int i=0;i<points.length;i++)
        {
            HashMap <Double,Integer> hm = new HashMap<Double,Integer>();
            int samep=0;
            int samex=1;
            for(int j=0;j<points.length;j++)
                if(j!=i)
                    {
                        if((points[i].x==points[j].x)&&(points[i].y==points[j].y))
                           { 
                               samep++;
                              
                           }
                        if((points[i].x==points[j].x))
                            {
                                samex++;
                                continue;
                            }
                        double k=(double)(points[i].y-points[j].y)/(double)(points[i].x-points[j].x);
                        if(hm.containsKey(k))
                            hm.put(k,hm.get(k)+1);
                            else
                                hm.put(k,2);
                        result= Math.max(result,hm.get(k)+samep);
                    }
            result=Math.max(result,samex);
        }
        return result;
    }
}