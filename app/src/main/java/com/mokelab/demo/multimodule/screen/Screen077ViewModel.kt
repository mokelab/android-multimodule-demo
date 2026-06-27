package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data761RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data762RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data763RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data764RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data765RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data766RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data767RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data768RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data769RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data770RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen077ViewModel @Inject constructor(
    private val repo1: Data761RepositoryImpl,
    private val repo2: Data762RepositoryImpl,
    private val repo3: Data763RepositoryImpl,
    private val repo4: Data764RepositoryImpl,
    private val repo5: Data765RepositoryImpl,
    private val repo6: Data766RepositoryImpl,
    private val repo7: Data767RepositoryImpl,
    private val repo8: Data768RepositoryImpl,
    private val repo9: Data769RepositoryImpl,
    private val repo10: Data770RepositoryImpl,

): ViewModel() {
}
