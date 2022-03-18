/**
 * Math function grapher
 *
 * @author Marc Oliveras <admin@oligalma.com> 
 * @link http://www.oligalma.com
 * @copyright 2021 Oligalma
 * @license GPL License v3
 */

package magicalfunctiongenerator.domini;

import java.awt.*;

public abstract class Colisionable extends Sprite
{
  private boolean colisio;

  public boolean getColisio()
  {
    return colisio;
  }

  public void setColisio(boolean b)
  {
    colisio = b;
  }

  protected Colisionable(Grafica grafica)
  {
    super(grafica);
  }

  public boolean colisio(int x, int y)
  {
    return getShapeColisio().contains(x, y);
  }

  protected abstract Shape getShapeColisio();
}
