/**
 * Math function grapher
 *
 * @author Marc Oliveras <admin@oligalma.com> 
 * @link http://www.oligalma.com
 * @copyright 2021 Oligalma
 * @license GPL License v3
 */

package magicalfunctiongenerator.domini.linies;

import magicalfunctiongenerator.domini.*;
import java.awt.*;

public class LiniesYGraella extends LiniesGraella
{
  public LiniesYGraella(Grafica g)
  {
    super(g);
  }

  protected void dibuixarLinia(Graphics2D g2, float pos)
  {
    g2.drawLine(map.toScreenX(pos), map.toScreenYmin(), map.toScreenX(pos), map.toScreenYmax());
  }

  protected float getMax()
  {
    return map.getXMaxWorld();
  }

  protected float getMin()
  {
    return map.getXMinWorld();
  }
}
