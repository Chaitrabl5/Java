/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class NewClass24
{
    public static void main(String[] a)
    {
        try
        {
            int i = 10 / 0;
        }
        catch (Exception ex)
        {
            System.out.println("1st catch Block");
        }
        finally
        {
            System.out.println("1st finally block");
        }
        try
        {
            int i = 10 / 10;
        }
        catch (Exception ex)
        {
            System.out.println("2nd catch Block");
        }
        finally
        {
            System.out.println("2nd finally block");
        }
    }

    
}