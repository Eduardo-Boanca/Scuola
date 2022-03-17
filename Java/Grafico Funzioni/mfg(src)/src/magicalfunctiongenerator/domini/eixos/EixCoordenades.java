/**
 * Math function grapher
 *
 * @author Marc Oliveras <admin@oligalma.com> 
 * @link http://www.oligalma.com
 * @copyright 2021 Oligalma
 * @license GPL License v3
 */

package magicalfunctiongenerator.domini.eixos;

import magicalfunctiongenerator.domini.*;
import java.awt.*;

public class EixCoordenades
{
  private EixX eixX;
  private EixY eixY;


  public EixCoordenades(Grafica g)
  {
    eixX = new EixX(g);
    eixY = new EixY(g);
  }

  public void dibuixar(Graphics2D g2)
  {
    eixX.dibuixar(g2);
    eixY.dibuixar(g2);
  }
}
