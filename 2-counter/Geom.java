package ru.korotkov.work4;

/**
 * Created by User on 04/06/2015.
 */
public class Geom  implements Comparable {
    public double S;
    @Override
    public int compareTo(Object obj)

    {
        Geom tmp = (Geom) obj;
        if(this.S > tmp.S)
        {
      /* ������� ������ ����������� */
            return -1;
        }
        else if(this.S < tmp.S)
        {
      /* ������� ������ ����������� */
            return 1;
        }
    /* ������� ����� ����������� */
        return 0;
    }

}
