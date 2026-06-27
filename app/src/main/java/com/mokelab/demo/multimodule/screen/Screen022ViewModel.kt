package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data211RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data212RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data213RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data214RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data215RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data216RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data217RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data218RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data219RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data220RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen022ViewModel @Inject constructor(
    private val repo1: Data211RepositoryImpl,
    private val repo2: Data212RepositoryImpl,
    private val repo3: Data213RepositoryImpl,
    private val repo4: Data214RepositoryImpl,
    private val repo5: Data215RepositoryImpl,
    private val repo6: Data216RepositoryImpl,
    private val repo7: Data217RepositoryImpl,
    private val repo8: Data218RepositoryImpl,
    private val repo9: Data219RepositoryImpl,
    private val repo10: Data220RepositoryImpl,

): ViewModel() {
}
