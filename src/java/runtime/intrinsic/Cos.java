/**
 * ADOBE SYSTEMS INCORPORATED
 * Copyright 2009-2013 Adobe Systems Incorporated
 * All Rights Reserved.
 *
 * NOTICE: Adobe permits you to use, modify, and distribute
 * this file in accordance with the terms of the MIT license,
 * a copy of which can be found in the LICENSE.txt file or at
 * http://opensource.org/licenses/MIT.
 */
package runtime.intrinsic;

import compile.type.Type;
import compile.type.Types;
import runtime.rep.lambda.IntrinsicLambda;

/**
 * cos()
 *
 * @author Basil Hosmer
 */
public final class Cos extends IntrinsicLambda
{
    public static final String NAME = "cos";

    public static final Type TYPE =
        Types.fun(Types.DOUBLE, Types.DOUBLE);

    public String getName()
    {
        return NAME;
    }

    public Type getType()
    {
        return TYPE;
    }

    public Object apply(final Object arg)
    {
        return invoke((Double)arg);
    }

    public static double invoke(final double arg)
    {
        return Math.cos(arg);
    }
}