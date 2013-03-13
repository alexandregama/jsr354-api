/*
 *  Copyright (c) 2012, 2013, Werner Keil, Credit Suisse (Anatole Tresch).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 * 
 * Contributors:
 *    Anatole Tresch - initial version.
 */
package javax.money;

/**
 * This interface defines a {@link Rounding}. It is hereby important to
 * distinguish between internal rounding such as implied by the maximal
 * precision/scale of an amount, contrary to rounding applied to a
 * {@link MonetaryAmount} or a calculation algorithm. Since different use cases
 * may require {@link Rounding} done at very different stages within a complex
 * financial calculation, {@link Rounding}is not directly attached with its
 * type.
 * <p>
 * Nevertheless the JSR's extensions provide a RoundingMonetaryAmount, which
 * wraps a {@link MonetaryAmount} and adds implicit rounding.
 * 
 * @author Anatole Tresch
 */
public interface Rounding {

	/**
	 * This method is called for rounding an amount.
	 * 
	 * @param amount
	 *            the amount to be rounded
	 * @return the rounded amount.
	 * @throws ArithmeticException
	 *             if rounding fails.
	 */
	public MonetaryAmount round(MonetaryAmount amount);
	

}