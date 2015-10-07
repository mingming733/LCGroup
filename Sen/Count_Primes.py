class Solution(object):
    def countPrimes(self, n): # https://primes.utm.edu/howmany.html http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
        """
        :type n: int
        :rtype: int
        """
        isPrime = [True] * max(n, 2)
        isPrime[0], isPrime[1] = False, False
        x = 2
        while x * x < n:
        	if isPrime[x]:
        		p = x * x
        		while p < n:
        			isPrime[p] = False
        			p += x
        	x += 1
        return sum(isPrime)

n = 14
i = Solution()
print i.countPrimes(n)