public class Point
{
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y= y;
    }

    public Point (int val)
    {
        x = val;
        y = val;
    }

    public Point()
    {
        x = 0;
        y = 0;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int newX)
    {
        x = newX;
    }
    public void setY(int newY)
    {
        y = newY;
    }

    public String coordinate()
    {
        return "(5, 8)";
    }

    public boolean quadrant()
    {
        String quadrant;
        if (x < 0 && y < 0)
        {
            quadrant = "I";
        } else if (x > 0 && y < 0)
        {
            quadrant = "II";
        } else if (x > 0 && y > 0)
        {
             quadrant = "III";
        } else if (x < 0 && y > 0)
        {
            String quadrant = "IV";
        } else if (x == 0 && y == 0)
        {
            return "origin";
        } else if ((x == 0 && ((y > 0) || (y < 0)) || ((x > 0) || (x < 0)) && y ==0))
        {
            return "on an axis";
        }

    }

}
