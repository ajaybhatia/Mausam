/*
 * The MIT License
 *
 * Copyright 2014 Ajay Bhatia <prof.ajaybhatia@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.ajaybhatia.mausam;

import java.io.IOException;
import net.aksingh.java.api.owm.CurrentWeatherData;
import net.aksingh.java.api.owm.OpenWeatherMap;

/**
 *
 * @author Ajay Bhatia <prof.ajaybhatia@gmail.com>
 */
public class Mausam {
    public static void main(String[] args) throws IOException, org.json.JSONException{
        OpenWeatherMap own = new OpenWeatherMap("");
        CurrentWeatherData cwd = own.currentWeatherByCityName("Hoshiarpur", "IN");
        CurrentWeatherData.Coord coord = cwd.getCoordinates_Object();
        CurrentWeatherData.Main main = cwd.getMainData_Object();
        
        System.out.println("           City: " + cwd.getCityName());
        System.out.println("       Latitude: " + coord.getLatitude());
        System.out.println("      Longitude: " + coord.getLongitude());
        System.out.println("Max. Temperatue: " + main.getMaxTemperature());
        System.out.println("Min. Temperatue: " + main.getMinTemperature());
        System.out.println("       Pressure: " + main.getPressure());
        System.out.println("       Humidity: " + main.getHumidity());
    }
}
